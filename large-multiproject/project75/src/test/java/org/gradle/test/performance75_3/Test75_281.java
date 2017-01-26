package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_281 {
    private final Production75_281 production = new Production75_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}