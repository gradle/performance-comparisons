package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_248 {
    private final Production97_248 production = new Production97_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}