package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_377 {
    private final Production24_377 production = new Production24_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}