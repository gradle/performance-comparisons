package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_426 {
    private final Production23_426 production = new Production23_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}