package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_376 {
    private final Production64_376 production = new Production64_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}