package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_7 {
    private final Production24_7 production = new Production24_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}