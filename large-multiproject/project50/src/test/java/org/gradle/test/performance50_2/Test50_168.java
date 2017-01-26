package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_168 {
    private final Production50_168 production = new Production50_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}