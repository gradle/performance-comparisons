package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_365 {
    private final Production24_365 production = new Production24_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}