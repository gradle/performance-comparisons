package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_297 {
    private final Production50_297 production = new Production50_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}