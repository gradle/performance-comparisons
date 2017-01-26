package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_72 {
    private final Production26_72 production = new Production26_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}