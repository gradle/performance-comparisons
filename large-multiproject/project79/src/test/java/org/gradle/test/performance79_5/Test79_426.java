package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_426 {
    private final Production79_426 production = new Production79_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}