package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_288 {
    private final Production31_288 production = new Production31_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}