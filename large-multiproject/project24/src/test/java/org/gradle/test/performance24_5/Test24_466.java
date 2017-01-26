package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_466 {
    private final Production24_466 production = new Production24_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}