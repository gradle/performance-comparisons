package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_200 {
    private final Production58_200 production = new Production58_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}