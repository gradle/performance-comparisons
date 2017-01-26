package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_241 {
    private final Production24_241 production = new Production24_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}