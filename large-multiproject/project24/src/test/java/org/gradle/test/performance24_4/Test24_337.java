package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_337 {
    private final Production24_337 production = new Production24_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}