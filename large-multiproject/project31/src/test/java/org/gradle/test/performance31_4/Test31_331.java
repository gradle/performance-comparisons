package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_331 {
    private final Production31_331 production = new Production31_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}