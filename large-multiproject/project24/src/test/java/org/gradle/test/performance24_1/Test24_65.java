package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_65 {
    private final Production24_65 production = new Production24_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}