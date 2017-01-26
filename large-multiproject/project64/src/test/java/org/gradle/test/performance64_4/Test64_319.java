package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_319 {
    private final Production64_319 production = new Production64_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}