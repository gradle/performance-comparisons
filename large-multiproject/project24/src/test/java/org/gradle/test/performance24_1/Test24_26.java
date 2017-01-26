package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_26 {
    private final Production24_26 production = new Production24_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}