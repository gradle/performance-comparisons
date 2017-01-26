package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_96 {
    private final Production26_96 production = new Production26_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}