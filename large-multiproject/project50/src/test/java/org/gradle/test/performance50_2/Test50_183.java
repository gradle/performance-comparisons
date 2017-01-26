package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_183 {
    private final Production50_183 production = new Production50_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}