package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_68 {
    private final Production75_68 production = new Production75_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}