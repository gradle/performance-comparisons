package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_172 {
    private final Production75_172 production = new Production75_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}