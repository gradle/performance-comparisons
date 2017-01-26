package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_117 {
    private final Production64_117 production = new Production64_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}