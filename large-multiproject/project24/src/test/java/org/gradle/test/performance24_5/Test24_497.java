package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_497 {
    private final Production24_497 production = new Production24_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}