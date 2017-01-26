package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_48 {
    private final Production24_48 production = new Production24_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}