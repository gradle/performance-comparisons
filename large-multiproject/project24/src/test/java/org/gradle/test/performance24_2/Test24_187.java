package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_187 {
    private final Production24_187 production = new Production24_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}