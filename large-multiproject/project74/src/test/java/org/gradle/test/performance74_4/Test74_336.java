package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_336 {
    private final Production74_336 production = new Production74_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}