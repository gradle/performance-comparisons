package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_294 {
    private final Production31_294 production = new Production31_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}