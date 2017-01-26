package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_199 {
    private final Production24_199 production = new Production24_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}