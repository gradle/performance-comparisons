package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_260 {
    private final Production50_260 production = new Production50_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}