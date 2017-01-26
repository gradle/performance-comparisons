package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_330 {
    private final Production50_330 production = new Production50_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}