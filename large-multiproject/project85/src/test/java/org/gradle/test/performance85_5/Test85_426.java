package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_426 {
    private final Production85_426 production = new Production85_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}