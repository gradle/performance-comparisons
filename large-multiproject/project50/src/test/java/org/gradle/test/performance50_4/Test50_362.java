package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_362 {
    private final Production50_362 production = new Production50_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}