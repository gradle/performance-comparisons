package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_444 {
    private final Production31_444 production = new Production31_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}