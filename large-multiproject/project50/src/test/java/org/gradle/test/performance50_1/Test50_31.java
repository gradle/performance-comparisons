package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_31 {
    private final Production50_31 production = new Production50_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}