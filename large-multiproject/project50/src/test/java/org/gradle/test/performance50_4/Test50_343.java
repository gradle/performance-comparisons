package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_343 {
    private final Production50_343 production = new Production50_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}