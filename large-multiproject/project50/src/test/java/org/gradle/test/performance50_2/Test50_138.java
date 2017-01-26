package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_138 {
    private final Production50_138 production = new Production50_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}