package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_217 {
    private final Production49_217 production = new Production49_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}