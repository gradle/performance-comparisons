package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_331 {
    private final Production47_331 production = new Production47_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}