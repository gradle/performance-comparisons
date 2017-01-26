package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_497 {
    private final Production50_497 production = new Production50_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}