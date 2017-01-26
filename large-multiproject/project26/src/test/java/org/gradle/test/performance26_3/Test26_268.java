package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_268 {
    private final Production26_268 production = new Production26_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}