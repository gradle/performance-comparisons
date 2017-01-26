package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_244 {
    private final Production24_244 production = new Production24_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}