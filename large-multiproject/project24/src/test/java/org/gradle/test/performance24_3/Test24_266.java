package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_266 {
    private final Production24_266 production = new Production24_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}