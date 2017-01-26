package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_119 {
    private final Production75_119 production = new Production75_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}