package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_426 {
    private final Production33_426 production = new Production33_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}