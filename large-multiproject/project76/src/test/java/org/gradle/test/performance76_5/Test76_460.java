package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_460 {
    private final Production76_460 production = new Production76_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}