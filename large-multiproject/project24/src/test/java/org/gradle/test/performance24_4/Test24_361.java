package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_361 {
    private final Production24_361 production = new Production24_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}