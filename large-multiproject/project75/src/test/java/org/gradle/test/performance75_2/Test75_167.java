package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_167 {
    private final Production75_167 production = new Production75_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}