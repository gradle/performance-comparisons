package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_61 {
    private final Production26_61 production = new Production26_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}