package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_63 {
    private final Production50_63 production = new Production50_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}