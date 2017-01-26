package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_409 {
    private final Production23_409 production = new Production23_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}