package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_426 {
    private final Production19_426 production = new Production19_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}