package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_297 {
    private final Production26_297 production = new Production26_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}