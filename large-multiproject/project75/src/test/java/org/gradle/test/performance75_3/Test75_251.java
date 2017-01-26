package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_251 {
    private final Production75_251 production = new Production75_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}