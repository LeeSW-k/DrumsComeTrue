/*
 * Copyright 2023 The TensorFlow Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ssafy.drumscometrue.freePlay

import androidx.lifecycle.ViewModel
import com.ssafy.drumscometrue.freePlay.HandLandmarkerHelper
import com.ssafy.drumscometrue.freePlay.PoseLandmarkerHelper

/**
 * Android앱에서 사용되는 ViewModel클래스
 * Pose Landmarker Helper의 설정 저장, 관리
 * */
class MainViewModel : ViewModel() {

    //pose 변수 초기화
    private var _model = PoseLandmarkerHelper.MODEL_POSE_LANDMARKER_LITE
    private var _delegate: Int = PoseLandmarkerHelper.DELEGATE_GPU
    private var _minPoseDetectionConfidence: Float =
        PoseLandmarkerHelper.DEFAULT_POSE_DETECTION_CONFIDENCE
    private var _minPoseTrackingConfidence: Float = PoseLandmarkerHelper
        .DEFAULT_POSE_TRACKING_CONFIDENCE
    private var _minPosePresenceConfidence: Float = PoseLandmarkerHelper
        .DEFAULT_POSE_PRESENCE_CONFIDENCE

    //hand 변수 초기화
    private var _delegateHand: Int = HandLandmarkerHelper.DELEGATE_GPU
    private var _minHandDetectionConfidence: Float =
        HandLandmarkerHelper.DEFAULT_HAND_DETECTION_CONFIDENCE
    private var _minHandTrackingConfidence: Float = HandLandmarkerHelper
        .DEFAULT_HAND_TRACKING_CONFIDENCE
    private var _minHandPresenceConfidence: Float = HandLandmarkerHelper
        .DEFAULT_HAND_PRESENCE_CONFIDENCE
    private var _maxHands: Int = HandLandmarkerHelper.DEFAULT_NUM_HANDS

    /**
     * Getter메서드
     * 현재 설정 값을 반환하는 게터 메서드
     * */
    val currentDelegate: Int get() = _delegate
    val currentModel: Int get() = _model
    val currentMinPoseDetectionConfidence: Float
        get() =
            _minPoseDetectionConfidence
    val currentMinPoseTrackingConfidence: Float
        get() =
            _minPoseTrackingConfidence
    val currentMinPosePresenceConfidence: Float
        get() =
            _minPosePresenceConfidence


    val currentDelegateHand: Int get() = _delegateHand
    val currentMinHandDetectionConfidence: Float
        get() =
            _minHandDetectionConfidence
    val currentMinHandTrackingConfidence: Float
        get() =
            _minHandTrackingConfidence
    val currentMinHandPresenceConfidence: Float
        get() =
            _minHandPresenceConfidence
    val currentMaxHands: Int get() = _maxHands


    /**
     * Setter메서드
     * */
    fun setDelegate(delegate: Int) {
        _delegate = delegate
    }

    fun setMinPoseDetectionConfidence(confidence: Float) {
        _minPoseDetectionConfidence = confidence
    }

    fun setMinPoseTrackingConfidence(confidence: Float) {
        _minPoseTrackingConfidence = confidence
    }

    fun setMinPosePresenceConfidence(confidence: Float) {
        _minPosePresenceConfidence = confidence
    }

    fun setModel(model: Int) {
        _model = model
    }



    fun setDelegateHand(delegate: Int) {
        _delegateHand = delegate
    }

    fun setMinHandDetectionConfidence(confidence: Float) {
        _minHandDetectionConfidence = confidence
    }
    fun setMinHandTrackingConfidence(confidence: Float) {
        _minHandTrackingConfidence = confidence
    }
    fun setMinHandPresenceConfidence(confidence: Float) {
        _minHandPresenceConfidence = confidence
    }

    fun setMaxHands(maxResults: Int) {
        _maxHands = maxResults
    }
}