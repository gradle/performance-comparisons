package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_280 {
    private final Production29_280 production = new Production29_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}