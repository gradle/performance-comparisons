package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_347 {
    private final Production75_347 production = new Production75_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}