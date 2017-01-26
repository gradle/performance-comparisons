package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_477 {
    private final Production24_477 production = new Production24_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}