package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_313 {
    private final Production24_313 production = new Production24_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}