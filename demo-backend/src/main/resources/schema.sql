CREATE TABLE drug(
                     id BIGINT PRIMARY KEY AUTO_INCREMENT,
                     drug_name VARCHAR(100),
                     drug_type VARCHAR(50),
                     drug_usage TEXT,
                     contraindication TEXT,
                     effect TEXT
);

INSERT INTO drug(drug_name,drug_type,drug_usage,contraindication,effect) VALUES
                                                                        ('布洛芬','解热镇痛药','口服，一次1片','对本品过敏禁用','缓解发热、疼痛'),
                                                                        ('阿莫西林','抗生素','遵医嘱服用','青霉素过敏禁用','抗菌消炎'),
                                                                        ('复方甘草片','止咳药','口服','孕妇慎用','镇咳祛痰'),
                                                                        ('奥美拉唑','抑酸药','饭前服用','过敏禁用','治疗胃炎胃溃疡'),
                                                                        ('氯雷他定','抗过敏药','口服','严重肝肾功能不全慎用','缓解过敏');
