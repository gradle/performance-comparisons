package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_122 {
    private final Production24_122 production = new Production24_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}