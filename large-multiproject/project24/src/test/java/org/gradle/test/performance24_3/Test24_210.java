package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_210 {
    private final Production24_210 production = new Production24_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}