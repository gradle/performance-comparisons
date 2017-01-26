package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_81 {
    private final Production24_81 production = new Production24_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}