package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_437 {
    private final Production26_437 production = new Production26_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}