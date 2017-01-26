package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_92 {
    private final Production24_92 production = new Production24_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}