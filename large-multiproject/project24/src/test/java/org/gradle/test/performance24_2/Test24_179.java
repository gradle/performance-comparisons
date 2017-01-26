package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_179 {
    private final Production24_179 production = new Production24_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}