package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_76 {
    private final Production75_76 production = new Production75_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}