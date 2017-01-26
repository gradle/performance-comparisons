package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_220 {
    private final Production24_220 production = new Production24_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}