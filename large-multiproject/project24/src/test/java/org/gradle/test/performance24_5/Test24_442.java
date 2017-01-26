package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_442 {
    private final Production24_442 production = new Production24_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}