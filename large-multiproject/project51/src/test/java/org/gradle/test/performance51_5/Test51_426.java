package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_426 {
    private final Production51_426 production = new Production51_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}