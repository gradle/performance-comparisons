package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_50 {
    private final Production64_50 production = new Production64_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}