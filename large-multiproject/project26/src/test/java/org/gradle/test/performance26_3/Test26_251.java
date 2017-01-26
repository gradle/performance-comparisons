package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_251 {
    private final Production26_251 production = new Production26_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}