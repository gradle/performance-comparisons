package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_253 {
    private final Production47_253 production = new Production47_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}