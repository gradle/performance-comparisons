package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_119 {
    private final Production50_119 production = new Production50_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}