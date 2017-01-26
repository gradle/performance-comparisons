package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_454 {
    private final Production64_454 production = new Production64_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}