package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_161 {
    private final Production24_161 production = new Production24_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}