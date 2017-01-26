package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_77 {
    private final Production75_77 production = new Production75_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}