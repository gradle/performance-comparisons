package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_166 {
    private final Production31_166 production = new Production31_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}