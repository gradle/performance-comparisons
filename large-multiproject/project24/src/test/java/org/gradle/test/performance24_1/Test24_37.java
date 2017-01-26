package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_37 {
    private final Production24_37 production = new Production24_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}