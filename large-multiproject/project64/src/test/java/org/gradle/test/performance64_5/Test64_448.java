package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_448 {
    private final Production64_448 production = new Production64_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}