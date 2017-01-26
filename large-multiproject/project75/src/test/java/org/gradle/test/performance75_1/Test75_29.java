package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_29 {
    private final Production75_29 production = new Production75_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}