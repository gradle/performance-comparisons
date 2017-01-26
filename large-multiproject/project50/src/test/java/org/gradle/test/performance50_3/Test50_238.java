package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_238 {
    private final Production50_238 production = new Production50_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}