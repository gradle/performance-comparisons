package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_300 {
    private final Production24_300 production = new Production24_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}