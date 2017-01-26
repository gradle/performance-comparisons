package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_465 {
    private final Production50_465 production = new Production50_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}