package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_100 {
    private final Production50_100 production = new Production50_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}