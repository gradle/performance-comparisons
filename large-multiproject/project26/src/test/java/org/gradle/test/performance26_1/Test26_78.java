package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_78 {
    private final Production26_78 production = new Production26_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}