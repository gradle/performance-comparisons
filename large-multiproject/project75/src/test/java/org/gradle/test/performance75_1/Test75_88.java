package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_88 {
    private final Production75_88 production = new Production75_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}