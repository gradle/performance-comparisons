package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_80 {
    private final Production26_80 production = new Production26_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}