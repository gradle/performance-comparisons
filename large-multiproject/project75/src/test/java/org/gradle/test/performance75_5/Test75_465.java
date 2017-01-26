package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_465 {
    private final Production75_465 production = new Production75_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}