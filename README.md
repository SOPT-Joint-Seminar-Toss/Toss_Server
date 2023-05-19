# 💸 Toss_Server
> 합동 세미나 모바일 7조 서버
<br>

## 🌸 Project Structure
<details>
<summary>Details</summary>

```jsx
.
toss
├── TossApplication.class
├── common
│   ├── Constant
│   │   └── Constant.class
│   ├── advice
│   │   └── ControllerExceptionAdvice.class
│   └── dto
│       └── ApiResponse.class
├── controller
│   ├── asset
│   │   ├── AssetController.class
│   │   └── dto
│   │       └── response
│   │           └── AssetResDto.class
│   └── product
│       ├── ProductController.class
│       └── dto
│           ├── request
│           │   └── PresentReqDto.class
│           └── response
│               ├── BrandConDetailDto.class
│               ├── BrandConResDto.class
│               └── ProductResDto.class
├── domain
│   ├── Asset.class
│   ├── CardType.class
│   ├── GroupBuying.class
│   ├── Like.class
│   ├── Present$PresentBuilder.class
│   ├── Present.class
│   ├── Product.class
│   └── User.class
├── exception
│   ├── Error.class
│   ├── Success.class
│   └── model
│       ├── BadRequestException.class
│       ├── NotFoundException.class
│       ├── ServerErrorException.class
│       └── TossException.class
├── repository
│   ├── AssetRepository.class
│   ├── GroupBuyingRepository.class
│   ├── LikeRepository.class
│   ├── ProductRepository.class
│   └── UserRepository.class
└── service
│   ├── AssetService.class
│   └── ProductService.class
  ```
<br>
</details>
<br><br>

## 🌸 ERD
<img width="794" alt="스크린샷 2023-05-19 오후 5 37 45" src="https://github.com/SOPT-Joint-Seminar-Toss/Toss_Server/assets/90022940/0a6095a1-359b-42bf-bdd9-7fbda119b32d">
<br>
<br>

## 🌸 API Specification
[API 명세서]( https://www.notion.so/go-sopt/5694ea5a2af1488aa0fd9caac9018d4d?v=eef501da66754ca9a61d004155f06fce )
<br>
<br>

## 🌸 Git Convention
[Git Convention]( https://fascinated-hawthorn-e73.notion.site/Git-Convention-10c53786033d473a990f20a203094218 )
<br>
<br>

## 🌸 Code Convention
[Code Convention]( https://fascinated-hawthorn-e73.notion.site/Code-Convention-10f7fc24cfc24a9486ee9e22d33bc924 )
<br>
<br>

## 🌸 Members
|[강원용](https://github.com/KWY0218)|[박소정](https://github.com/sojungpp.png)
|:---:|:---:|
|<img src="https://avatars.githubusercontent.com/u/82709044?v=4" width="180" height="180" >|<img src="https://github.com/sojungpp.png" width="180" height="180" >|
|[GET] `{base_url}/product` <br> [GET] `{base_url}/product/brand` <br> [GET] `{base_url}/product/brand/{productId}`|[GET] `{base_url}/asset` <br> [PATCH] `{base_url}/product/brand/{productId}` <br> [POST] `{base_url}/product/brand/present/{productId}` |
> Pair Programming 진행 
