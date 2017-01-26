package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_476 {
    private final Production24_476 production = new Production24_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}