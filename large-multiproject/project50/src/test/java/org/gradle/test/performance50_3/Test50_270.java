package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_270 {
    private final Production50_270 production = new Production50_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}