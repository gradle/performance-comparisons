package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_385 {
    private final Production64_385 production = new Production64_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}