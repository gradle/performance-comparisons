package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_324 {
    private final Production24_324 production = new Production24_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}