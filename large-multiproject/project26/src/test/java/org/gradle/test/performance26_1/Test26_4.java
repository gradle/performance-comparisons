package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_4 {
    private final Production26_4 production = new Production26_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}