package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_97 {
    private final Production75_97 production = new Production75_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}