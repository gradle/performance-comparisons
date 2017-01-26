package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_136 {
    private final Production24_136 production = new Production24_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}