package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_329 {
    private final Production24_329 production = new Production24_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}