package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_426 {
    private final Production81_426 production = new Production81_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}