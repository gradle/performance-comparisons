package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_303 {
    private final Production50_303 production = new Production50_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}