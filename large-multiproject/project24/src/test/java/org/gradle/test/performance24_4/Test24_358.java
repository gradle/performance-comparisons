package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_358 {
    private final Production24_358 production = new Production24_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}