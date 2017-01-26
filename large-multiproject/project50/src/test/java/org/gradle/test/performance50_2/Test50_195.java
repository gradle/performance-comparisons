package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_195 {
    private final Production50_195 production = new Production50_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}