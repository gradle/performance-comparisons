package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_76 {
    private final Production47_76 production = new Production47_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}