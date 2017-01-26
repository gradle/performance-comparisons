package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_45 {
    private final Production31_45 production = new Production31_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}