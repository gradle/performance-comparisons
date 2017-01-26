package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_323 {
    private final Production26_323 production = new Production26_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}