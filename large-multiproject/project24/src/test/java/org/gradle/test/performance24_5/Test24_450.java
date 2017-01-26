package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_450 {
    private final Production24_450 production = new Production24_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}