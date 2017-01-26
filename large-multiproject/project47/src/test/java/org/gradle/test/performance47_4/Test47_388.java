package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_388 {
    private final Production47_388 production = new Production47_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}