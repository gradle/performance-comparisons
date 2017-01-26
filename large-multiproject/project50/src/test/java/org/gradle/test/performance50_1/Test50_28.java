package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_28 {
    private final Production50_28 production = new Production50_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}