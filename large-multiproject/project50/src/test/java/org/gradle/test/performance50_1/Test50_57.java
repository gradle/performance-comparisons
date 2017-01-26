package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_57 {
    private final Production50_57 production = new Production50_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}