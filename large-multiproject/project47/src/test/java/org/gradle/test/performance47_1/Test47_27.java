package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_27 {
    private final Production47_27 production = new Production47_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}