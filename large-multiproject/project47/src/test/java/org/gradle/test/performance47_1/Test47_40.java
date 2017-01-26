package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_40 {
    private final Production47_40 production = new Production47_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}