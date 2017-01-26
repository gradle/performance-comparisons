package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_356 {
    private final Production26_356 production = new Production26_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}