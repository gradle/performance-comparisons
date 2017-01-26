package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_40 {
    private final Production75_40 production = new Production75_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}