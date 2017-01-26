package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_468 {
    private final Production5_468 production = new Production5_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}