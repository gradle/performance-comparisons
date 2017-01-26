package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_176 {
    private final Production24_176 production = new Production24_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}