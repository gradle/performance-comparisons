package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_294 {
    private final Production75_294 production = new Production75_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}