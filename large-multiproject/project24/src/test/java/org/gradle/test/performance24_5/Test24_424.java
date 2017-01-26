package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_424 {
    private final Production24_424 production = new Production24_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}