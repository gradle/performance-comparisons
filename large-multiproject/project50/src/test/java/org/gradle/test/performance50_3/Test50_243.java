package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_243 {
    private final Production50_243 production = new Production50_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}