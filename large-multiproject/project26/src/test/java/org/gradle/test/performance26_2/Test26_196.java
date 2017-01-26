package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_196 {
    private final Production26_196 production = new Production26_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}