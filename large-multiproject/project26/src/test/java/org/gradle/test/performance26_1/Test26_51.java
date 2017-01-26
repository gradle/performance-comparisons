package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_51 {
    private final Production26_51 production = new Production26_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}