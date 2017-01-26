package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_77 {
    private final Production13_77 production = new Production13_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}