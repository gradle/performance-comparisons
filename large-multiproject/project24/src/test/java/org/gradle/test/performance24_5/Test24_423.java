package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_423 {
    private final Production24_423 production = new Production24_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}