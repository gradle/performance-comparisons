package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_127 {
    private final Production24_127 production = new Production24_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}