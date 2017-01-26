package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_171 {
    private final Production50_171 production = new Production50_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}