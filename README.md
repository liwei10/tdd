# Java基础项目
===========

这是一个基于Maven的基础项目,主要用于练习Java使用。

## 已存在代码说明

已经存在的代码主要讲解如何使用测试,我们看到HelloWorldTest下有两个测试,第一个测试演示了如何进行集成测试和使用Assert。
第二个测试演示了如何进行mock。

1.	参考战术建模，domain层内要有Repository负责存取对象、factory负责创建对象、domain service负责做领域层大的业务
	2.	Repository接口要在domain层
	3.	Repository的实现要在Domain层外
	4.	实现依赖Domain层，Domain层不依赖实现
	5.	application层在domain层外，不能有业务逻辑，只负责调度不同聚合的domain service。application service 可以依赖domain层的一切对象，但是domain层一切对象都不依赖外部对象
	6.	实体一旦被创建，没有业务原因不得有set等接口修改内部状态，值对象自然是不能修改
	7.	id使用uuid
	8.	id相同的entity就是相同的，而值相同的ValueObject才是相同的
	9.	不同聚合的domain不在一个包里，彼此的访问通过application service转发
	10.	所有的event要有ticketId和ticketType属性
