package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_147 {
    private final Production50_147 production = new Production50_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}