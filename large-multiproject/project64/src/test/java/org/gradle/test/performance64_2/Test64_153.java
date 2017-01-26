package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_153 {
    private final Production64_153 production = new Production64_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}