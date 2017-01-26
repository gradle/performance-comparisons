package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_426 {
    private final Production95_426 production = new Production95_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}