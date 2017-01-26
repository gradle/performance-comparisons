package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_307 {
    private final Production50_307 production = new Production50_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}