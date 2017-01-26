package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_458 {
    private final Production75_458 production = new Production75_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}