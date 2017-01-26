package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_164 {
    private final Production50_164 production = new Production50_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}