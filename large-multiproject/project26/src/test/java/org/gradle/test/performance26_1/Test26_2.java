package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_2 {
    private final Production26_2 production = new Production26_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}