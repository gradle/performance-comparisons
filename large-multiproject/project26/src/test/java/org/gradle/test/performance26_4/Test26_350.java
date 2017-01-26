package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_350 {
    private final Production26_350 production = new Production26_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}