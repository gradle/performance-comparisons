package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_41 {
    private final Production75_41 production = new Production75_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}