package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_63 {
    private final Production24_63 production = new Production24_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}