package com.likelion.likelionmail.mail.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ScheduledMailService {

    private final MailService mailService;


    @Scheduled(cron = "0 0 18 * * *")
    public void sendDailyMail() {
        log.info("매일 오후 6시 메일 발송");

        mailService.sendScheduledMail("dlrkdmsdlaa00@gmail.com");
    }
}