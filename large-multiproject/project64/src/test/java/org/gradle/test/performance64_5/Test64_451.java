package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_451 {
    private final Production64_451 production = new Production64_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}