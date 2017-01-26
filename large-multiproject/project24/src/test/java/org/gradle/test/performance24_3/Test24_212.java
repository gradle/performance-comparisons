package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_212 {
    private final Production24_212 production = new Production24_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}