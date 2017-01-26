package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_289 {
    private final Production24_289 production = new Production24_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}