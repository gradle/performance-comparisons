package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_175 {
    private final Production50_175 production = new Production50_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}