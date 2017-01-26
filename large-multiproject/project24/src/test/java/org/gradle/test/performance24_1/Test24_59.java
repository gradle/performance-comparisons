package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_59 {
    private final Production24_59 production = new Production24_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}