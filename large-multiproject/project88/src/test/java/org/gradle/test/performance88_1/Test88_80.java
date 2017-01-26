package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_80 {
    private final Production88_80 production = new Production88_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}