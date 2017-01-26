package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_435 {
    private final Production50_435 production = new Production50_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}