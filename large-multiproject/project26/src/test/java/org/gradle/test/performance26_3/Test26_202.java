package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_202 {
    private final Production26_202 production = new Production26_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}