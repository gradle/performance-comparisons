package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_54 {
    private final Production24_54 production = new Production24_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}