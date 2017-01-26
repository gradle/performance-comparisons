package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_436 {
    private final Production24_436 production = new Production24_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}