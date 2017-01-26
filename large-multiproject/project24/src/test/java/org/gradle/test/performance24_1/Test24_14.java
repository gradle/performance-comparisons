package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_14 {
    private final Production24_14 production = new Production24_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}