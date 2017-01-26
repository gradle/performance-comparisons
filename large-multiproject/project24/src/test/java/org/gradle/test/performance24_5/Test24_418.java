package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_418 {
    private final Production24_418 production = new Production24_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}