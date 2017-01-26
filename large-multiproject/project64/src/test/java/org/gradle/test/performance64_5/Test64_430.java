package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_430 {
    private final Production64_430 production = new Production64_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}