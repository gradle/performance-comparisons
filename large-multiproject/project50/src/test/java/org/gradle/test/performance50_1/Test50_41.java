package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_41 {
    private final Production50_41 production = new Production50_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}