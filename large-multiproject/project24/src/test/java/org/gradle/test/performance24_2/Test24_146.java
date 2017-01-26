package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_146 {
    private final Production24_146 production = new Production24_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}