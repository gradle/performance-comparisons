package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_172 {
    private final Production31_172 production = new Production31_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}