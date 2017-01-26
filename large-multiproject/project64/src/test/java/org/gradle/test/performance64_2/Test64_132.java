package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_132 {
    private final Production64_132 production = new Production64_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}