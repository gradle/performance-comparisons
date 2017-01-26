package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_347 {
    private final Production31_347 production = new Production31_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}