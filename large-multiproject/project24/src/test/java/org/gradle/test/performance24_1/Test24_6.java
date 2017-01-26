package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_6 {
    private final Production24_6 production = new Production24_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}