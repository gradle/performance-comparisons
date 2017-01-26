package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_364 {
    private final Production26_364 production = new Production26_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}