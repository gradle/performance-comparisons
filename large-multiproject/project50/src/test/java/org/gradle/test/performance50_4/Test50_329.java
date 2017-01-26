package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_329 {
    private final Production50_329 production = new Production50_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}