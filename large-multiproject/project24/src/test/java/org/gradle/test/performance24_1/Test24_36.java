package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_36 {
    private final Production24_36 production = new Production24_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}