package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_154 {
    private final Production26_154 production = new Production26_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}