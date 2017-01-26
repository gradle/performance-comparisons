package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_193 {
    private final Production24_193 production = new Production24_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}