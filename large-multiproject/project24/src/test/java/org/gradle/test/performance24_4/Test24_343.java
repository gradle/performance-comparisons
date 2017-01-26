package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_343 {
    private final Production24_343 production = new Production24_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}