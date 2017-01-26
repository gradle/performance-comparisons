package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_84 {
    private final Production50_84 production = new Production50_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}