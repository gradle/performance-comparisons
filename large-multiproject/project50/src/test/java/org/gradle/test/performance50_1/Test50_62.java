package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_62 {
    private final Production50_62 production = new Production50_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}