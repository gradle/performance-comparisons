package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_225 {
    private final Production88_225 production = new Production88_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}