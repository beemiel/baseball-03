//
//  ElectronicView.swift
//  BaseBall
//
//  Created by 신한섭 on 2020/05/08.
//  Copyright © 2020 신한섭. All rights reserved.
//

import UIKit

class ElectronicView: UIView {
    
    required init?(coder: NSCoder) {
        super.init(coder: coder)
        self.layer.cornerRadius = self.frame.width / 20
    }
    
    override init(frame: CGRect) {
        super.init(frame: frame)
        self.layer.cornerRadius = self.frame.width / 20
    }
}
