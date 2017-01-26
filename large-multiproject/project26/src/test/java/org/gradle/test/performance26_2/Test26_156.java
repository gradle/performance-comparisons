package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_156 {
    private final Production26_156 production = new Production26_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}