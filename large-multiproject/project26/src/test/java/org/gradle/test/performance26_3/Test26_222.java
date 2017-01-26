package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_222 {
    private final Production26_222 production = new Production26_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}