package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_186 {
    private final Production50_186 production = new Production50_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}