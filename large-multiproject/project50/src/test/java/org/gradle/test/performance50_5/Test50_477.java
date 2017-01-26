package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_477 {
    private final Production50_477 production = new Production50_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}