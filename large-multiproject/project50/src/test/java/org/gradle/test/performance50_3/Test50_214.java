package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_214 {
    private final Production50_214 production = new Production50_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}