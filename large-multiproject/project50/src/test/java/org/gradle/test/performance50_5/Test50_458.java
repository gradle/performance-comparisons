package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_458 {
    private final Production50_458 production = new Production50_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}