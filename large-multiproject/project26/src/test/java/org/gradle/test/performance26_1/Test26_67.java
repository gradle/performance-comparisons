package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_67 {
    private final Production26_67 production = new Production26_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}