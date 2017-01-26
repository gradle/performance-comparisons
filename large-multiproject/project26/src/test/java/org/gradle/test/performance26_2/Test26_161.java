package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_161 {
    private final Production26_161 production = new Production26_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}