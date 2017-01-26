package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_154 {
    private final Production24_154 production = new Production24_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}