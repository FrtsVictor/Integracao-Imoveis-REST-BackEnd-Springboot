package com.br.IntegracaoImoveis.exceptions;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ResourceNotFoundDetails extends ErrorDetailsPattern {

    public static final class Builder {
        private String title;
        private int status;
        private String detail;
        private OffsetDateTime timestamp;
        private String developerMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(OffsetDateTime offsetDateTime) {
            this.timestamp = offsetDateTime;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails validationErrorDetails = new ResourceNotFoundDetails();
           validationErrorDetails.setDeveloperMessage(developerMessage);
           validationErrorDetails.setTitle(title);
           validationErrorDetails.setDetail(detail);
           validationErrorDetails.setTimestamp(timestamp);
           validationErrorDetails.setStatus(status);
            return validationErrorDetails;
        }
    }

}
