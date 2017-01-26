package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_426 {
    private final Production11_426 production = new Production11_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}