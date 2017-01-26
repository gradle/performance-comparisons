package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_488 {
    private final Production24_488 production = new Production24_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}