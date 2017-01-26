package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_88 {
    private final Production50_88 production = new Production50_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}