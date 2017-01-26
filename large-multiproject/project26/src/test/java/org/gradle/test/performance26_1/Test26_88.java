package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_88 {
    private final Production26_88 production = new Production26_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}