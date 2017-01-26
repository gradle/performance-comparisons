package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_99 {
    private final Production26_99 production = new Production26_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}