package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_426 {
    private final Production65_426 production = new Production65_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}