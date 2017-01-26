package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_49 {
    private final Production75_49 production = new Production75_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}