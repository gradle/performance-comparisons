package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_235 {
    private final Production24_235 production = new Production24_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}