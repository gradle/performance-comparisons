package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_77 {
    private final Production47_77 production = new Production47_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}