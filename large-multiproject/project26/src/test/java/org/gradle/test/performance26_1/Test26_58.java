package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_58 {
    private final Production26_58 production = new Production26_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}