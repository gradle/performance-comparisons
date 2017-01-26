package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_228 {
    private final Production75_228 production = new Production75_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}