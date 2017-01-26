package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_458 {
    private final Production26_458 production = new Production26_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}