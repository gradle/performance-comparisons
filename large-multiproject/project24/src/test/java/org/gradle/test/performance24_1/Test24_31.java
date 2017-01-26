package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_31 {
    private final Production24_31 production = new Production24_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}