package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_305 {
    private final Production50_305 production = new Production50_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}