package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_325 {
    private final Production47_325 production = new Production47_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}