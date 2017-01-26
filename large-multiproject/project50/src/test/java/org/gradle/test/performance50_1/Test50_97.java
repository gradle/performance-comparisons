package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_97 {
    private final Production50_97 production = new Production50_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}