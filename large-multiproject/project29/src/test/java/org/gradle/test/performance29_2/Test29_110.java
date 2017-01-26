package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_110 {
    private final Production29_110 production = new Production29_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}