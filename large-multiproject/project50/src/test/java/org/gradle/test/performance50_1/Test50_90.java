package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_90 {
    private final Production50_90 production = new Production50_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}