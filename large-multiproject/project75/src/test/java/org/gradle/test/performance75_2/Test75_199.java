package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_199 {
    private final Production75_199 production = new Production75_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}