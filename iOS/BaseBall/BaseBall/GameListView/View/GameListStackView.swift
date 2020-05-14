//
//  GameListStackView.swift
//  BaseBall
//
//  Created by 신한섭 on 2020/05/06.
//  Copyright © 2020 신한섭. All rights reserved.
//

import UIKit

class GameListStackView: UIStackView {
    
    required init(coder: NSCoder) {
        super.init(coder: coder)
        setup()
    }
    
    override init(frame: CGRect) {
        super.init(frame: frame)
        setup()
    }
    
    private func setup() {
        self.axis = .vertical
        self.distribution = .fill
        self.spacing = 20
        self.alignment = .center
    }
}
