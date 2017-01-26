package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_126 {
    private final Production50_126 production = new Production50_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}