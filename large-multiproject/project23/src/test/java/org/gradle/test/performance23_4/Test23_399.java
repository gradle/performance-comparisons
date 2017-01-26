package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_399 {
    private final Production23_399 production = new Production23_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}