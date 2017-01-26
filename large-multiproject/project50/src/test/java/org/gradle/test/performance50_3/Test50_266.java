package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_266 {
    private final Production50_266 production = new Production50_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}