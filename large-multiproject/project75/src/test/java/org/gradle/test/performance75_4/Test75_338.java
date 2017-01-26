package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_338 {
    private final Production75_338 production = new Production75_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}