package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_281 {
    private final Production24_281 production = new Production24_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}