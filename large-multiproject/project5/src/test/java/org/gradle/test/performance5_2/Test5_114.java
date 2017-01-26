package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_114 {
    private final Production5_114 production = new Production5_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}