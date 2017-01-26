package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_435 {
    private final Production24_435 production = new Production24_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}