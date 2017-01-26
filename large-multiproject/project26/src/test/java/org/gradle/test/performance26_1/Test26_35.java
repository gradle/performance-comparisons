package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_35 {
    private final Production26_35 production = new Production26_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}