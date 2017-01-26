package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_382 {
    private final Production26_382 production = new Production26_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}