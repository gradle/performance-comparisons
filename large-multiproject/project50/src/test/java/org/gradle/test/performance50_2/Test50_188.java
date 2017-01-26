package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_188 {
    private final Production50_188 production = new Production50_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}