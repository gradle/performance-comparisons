package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_455 {
    private final Production24_455 production = new Production24_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}