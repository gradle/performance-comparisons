package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_53 {
    private final Production50_53 production = new Production50_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}