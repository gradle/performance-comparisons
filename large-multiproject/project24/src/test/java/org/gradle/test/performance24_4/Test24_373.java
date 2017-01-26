package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_373 {
    private final Production24_373 production = new Production24_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}