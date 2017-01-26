package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_27 {
    private final Production26_27 production = new Production26_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}