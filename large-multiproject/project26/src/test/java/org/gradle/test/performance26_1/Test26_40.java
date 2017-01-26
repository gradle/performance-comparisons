package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_40 {
    private final Production26_40 production = new Production26_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}