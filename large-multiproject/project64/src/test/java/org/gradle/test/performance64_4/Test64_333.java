package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_333 {
    private final Production64_333 production = new Production64_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}