package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_9 {
    private final Production31_9 production = new Production31_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}