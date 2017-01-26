package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_47 {
    private final Production24_47 production = new Production24_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}