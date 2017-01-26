package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_26 {
    private final Production26_26 production = new Production26_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}