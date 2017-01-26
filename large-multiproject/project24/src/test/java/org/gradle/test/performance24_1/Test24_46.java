package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_46 {
    private final Production24_46 production = new Production24_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}