package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_80 {
    private final Production75_80 production = new Production75_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}