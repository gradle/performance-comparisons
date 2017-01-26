package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_436 {
    private final Production23_436 production = new Production23_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}