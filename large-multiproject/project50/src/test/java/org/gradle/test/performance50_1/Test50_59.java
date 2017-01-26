package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_59 {
    private final Production50_59 production = new Production50_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}