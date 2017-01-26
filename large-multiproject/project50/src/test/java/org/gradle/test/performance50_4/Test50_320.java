package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_320 {
    private final Production50_320 production = new Production50_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}