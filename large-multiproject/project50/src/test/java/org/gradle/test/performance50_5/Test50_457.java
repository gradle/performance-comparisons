package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_457 {
    private final Production50_457 production = new Production50_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}