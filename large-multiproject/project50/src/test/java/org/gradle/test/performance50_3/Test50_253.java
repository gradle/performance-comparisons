package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_253 {
    private final Production50_253 production = new Production50_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}