package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_367 {
    private final Production26_367 production = new Production26_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}