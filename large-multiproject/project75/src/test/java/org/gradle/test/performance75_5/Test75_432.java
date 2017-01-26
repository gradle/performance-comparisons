package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_432 {
    private final Production75_432 production = new Production75_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}