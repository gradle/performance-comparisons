package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_420 {
    private final Production64_420 production = new Production64_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}