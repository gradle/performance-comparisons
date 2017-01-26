package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_202 {
    private final Production50_202 production = new Production50_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}