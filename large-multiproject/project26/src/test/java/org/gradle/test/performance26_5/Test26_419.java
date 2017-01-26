package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_419 {
    private final Production26_419 production = new Production26_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}