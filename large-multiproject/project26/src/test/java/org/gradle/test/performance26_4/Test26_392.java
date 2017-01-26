package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_392 {
    private final Production26_392 production = new Production26_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}