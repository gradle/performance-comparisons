package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_214 {
    private final Production24_214 production = new Production24_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}