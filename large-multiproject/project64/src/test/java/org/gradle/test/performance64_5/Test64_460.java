package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_460 {
    private final Production64_460 production = new Production64_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}