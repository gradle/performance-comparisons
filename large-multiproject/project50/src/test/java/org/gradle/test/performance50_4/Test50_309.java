package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_309 {
    private final Production50_309 production = new Production50_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}