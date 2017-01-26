package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_419 {
    private final Production24_419 production = new Production24_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}