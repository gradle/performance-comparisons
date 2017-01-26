package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_49 {
    private final Production31_49 production = new Production31_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}