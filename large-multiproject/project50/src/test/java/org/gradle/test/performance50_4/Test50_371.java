package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_371 {
    private final Production50_371 production = new Production50_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}