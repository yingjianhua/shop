package cn.it.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.it.shop.model.User;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User> {
	public String login() {
		//���е�½���ж�
		model = userService.login(model);
		if(model == null) {
			session.put("error", "��½ʧ��");
			return "login";
		} else {
			//��¼�ɹ����Ƚ��û��洢��session��
			session.put("user", model);
			//����session��goURL�Ƿ���ֵ������ҳ�����ת
			if(session.get("goURL") == null) {
				return "index"; //������ҳ
			} else {
				return "goURL";
			}
		}
	}
}
