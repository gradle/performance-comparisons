package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_48 {
    private final Production50_48 production = new Production50_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}