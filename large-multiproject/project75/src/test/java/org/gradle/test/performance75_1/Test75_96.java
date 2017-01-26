package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_96 {
    private final Production75_96 production = new Production75_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}