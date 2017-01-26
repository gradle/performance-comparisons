package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_239 {
    private final Production99_239 production = new Production99_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}