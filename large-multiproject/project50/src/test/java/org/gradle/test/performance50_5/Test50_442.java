package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_442 {
    private final Production50_442 production = new Production50_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}