package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_426 {
    private final Production74_426 production = new Production74_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}