package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_422 {
    private final Production24_422 production = new Production24_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}