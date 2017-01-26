package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_248 {
    private final Production60_248 production = new Production60_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}