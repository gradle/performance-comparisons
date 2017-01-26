package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_445 {
    private final Production47_445 production = new Production47_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}