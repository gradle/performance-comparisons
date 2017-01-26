package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_267 {
    private final Production47_267 production = new Production47_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}