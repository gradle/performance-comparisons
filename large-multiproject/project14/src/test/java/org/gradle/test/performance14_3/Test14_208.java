package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_208 {
    private final Production14_208 production = new Production14_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}