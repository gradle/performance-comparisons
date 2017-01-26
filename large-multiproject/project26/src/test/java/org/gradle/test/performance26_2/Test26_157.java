package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_157 {
    private final Production26_157 production = new Production26_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}