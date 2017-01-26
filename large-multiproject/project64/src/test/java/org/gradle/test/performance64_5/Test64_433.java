package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_433 {
    private final Production64_433 production = new Production64_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}