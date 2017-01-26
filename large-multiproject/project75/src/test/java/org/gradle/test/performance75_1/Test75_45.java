package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_45 {
    private final Production75_45 production = new Production75_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}