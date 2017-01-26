package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_426 {
    private final Production64_426 production = new Production64_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}