package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_157 {
    private final Production31_157 production = new Production31_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}