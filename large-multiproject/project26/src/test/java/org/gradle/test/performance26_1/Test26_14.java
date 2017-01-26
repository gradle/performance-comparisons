package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_14 {
    private final Production26_14 production = new Production26_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}