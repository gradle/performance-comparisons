package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_294 {
    private final Production26_294 production = new Production26_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}