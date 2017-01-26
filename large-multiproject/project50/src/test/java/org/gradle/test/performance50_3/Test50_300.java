package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_300 {
    private final Production50_300 production = new Production50_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}