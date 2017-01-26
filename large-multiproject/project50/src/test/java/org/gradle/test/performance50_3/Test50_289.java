package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_289 {
    private final Production50_289 production = new Production50_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}