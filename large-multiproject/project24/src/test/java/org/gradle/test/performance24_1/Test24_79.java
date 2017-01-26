package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_79 {
    private final Production24_79 production = new Production24_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}