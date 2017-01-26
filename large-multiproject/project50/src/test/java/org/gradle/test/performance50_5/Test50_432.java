package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_432 {
    private final Production50_432 production = new Production50_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}