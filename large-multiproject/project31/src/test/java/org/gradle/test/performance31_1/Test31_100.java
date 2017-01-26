package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_100 {
    private final Production31_100 production = new Production31_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}