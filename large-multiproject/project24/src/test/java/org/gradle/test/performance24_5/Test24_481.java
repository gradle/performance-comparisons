package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_481 {
    private final Production24_481 production = new Production24_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}