package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_322 {
    private final Production24_322 production = new Production24_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}