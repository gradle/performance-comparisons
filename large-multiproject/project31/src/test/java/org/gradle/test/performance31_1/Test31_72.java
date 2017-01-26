package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_72 {
    private final Production31_72 production = new Production31_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}