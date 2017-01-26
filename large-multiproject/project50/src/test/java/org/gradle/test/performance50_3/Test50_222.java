package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_222 {
    private final Production50_222 production = new Production50_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}