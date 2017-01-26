package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_203 {
    private final Production50_203 production = new Production50_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}