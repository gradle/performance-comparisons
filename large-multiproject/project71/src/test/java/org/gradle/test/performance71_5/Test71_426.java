package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_426 {
    private final Production71_426 production = new Production71_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}