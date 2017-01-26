package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_387 {
    private final Production85_387 production = new Production85_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}