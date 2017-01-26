package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_58 {
    private final Production31_58 production = new Production31_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}