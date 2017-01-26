package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_168 {
    private final Production75_168 production = new Production75_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}