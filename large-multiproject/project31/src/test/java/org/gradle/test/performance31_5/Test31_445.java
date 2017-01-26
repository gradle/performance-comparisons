package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_445 {
    private final Production31_445 production = new Production31_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}