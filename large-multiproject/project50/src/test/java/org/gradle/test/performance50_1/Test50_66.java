package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_66 {
    private final Production50_66 production = new Production50_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}