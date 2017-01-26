package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_437 {
    private final Production75_437 production = new Production75_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}