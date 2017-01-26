package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_216 {
    private final Production50_216 production = new Production50_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}