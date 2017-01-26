package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_238 {
    private final Production24_238 production = new Production24_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}