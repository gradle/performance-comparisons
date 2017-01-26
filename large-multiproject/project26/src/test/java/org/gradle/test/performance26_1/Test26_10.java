package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_10 {
    private final Production26_10 production = new Production26_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}