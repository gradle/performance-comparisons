package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_103 {
    private final Production24_103 production = new Production24_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}