package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_364 {
    private final Production24_364 production = new Production24_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}