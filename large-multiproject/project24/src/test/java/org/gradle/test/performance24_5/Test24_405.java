package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_405 {
    private final Production24_405 production = new Production24_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}