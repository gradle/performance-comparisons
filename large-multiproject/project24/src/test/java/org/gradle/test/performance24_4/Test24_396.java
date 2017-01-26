package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_396 {
    private final Production24_396 production = new Production24_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}