package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_109 {
    private final Production24_109 production = new Production24_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}