package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_257 {
    private final Production50_257 production = new Production50_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}