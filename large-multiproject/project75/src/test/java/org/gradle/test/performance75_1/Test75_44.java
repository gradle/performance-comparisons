package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_44 {
    private final Production75_44 production = new Production75_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}