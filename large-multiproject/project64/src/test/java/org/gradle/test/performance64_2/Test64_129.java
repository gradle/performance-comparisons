package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_129 {
    private final Production64_129 production = new Production64_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}