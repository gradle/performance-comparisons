package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_182 {
    private final Production24_182 production = new Production24_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}