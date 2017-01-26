package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_308 {
    private final Production24_308 production = new Production24_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}