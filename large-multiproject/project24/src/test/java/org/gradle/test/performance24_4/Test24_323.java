package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_323 {
    private final Production24_323 production = new Production24_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}