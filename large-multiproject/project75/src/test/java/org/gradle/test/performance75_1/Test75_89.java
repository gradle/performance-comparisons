package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_89 {
    private final Production75_89 production = new Production75_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}