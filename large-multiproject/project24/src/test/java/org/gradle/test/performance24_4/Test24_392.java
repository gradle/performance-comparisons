package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_392 {
    private final Production24_392 production = new Production24_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}