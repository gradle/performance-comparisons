package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_468 {
    private final Production24_468 production = new Production24_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}