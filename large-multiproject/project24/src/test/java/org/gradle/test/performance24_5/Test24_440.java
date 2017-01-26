package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_440 {
    private final Production24_440 production = new Production24_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}