package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_427 {
    private final Production50_427 production = new Production50_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}