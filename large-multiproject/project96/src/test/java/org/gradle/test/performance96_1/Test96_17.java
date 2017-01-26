package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_17 {
    private final Production96_17 production = new Production96_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}