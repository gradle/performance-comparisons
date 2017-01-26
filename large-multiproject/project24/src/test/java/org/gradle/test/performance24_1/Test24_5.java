package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_5 {
    private final Production24_5 production = new Production24_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}