package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_304 {
    private final Production50_304 production = new Production50_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}