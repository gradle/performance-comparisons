package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_426 {
    private final Production46_426 production = new Production46_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}