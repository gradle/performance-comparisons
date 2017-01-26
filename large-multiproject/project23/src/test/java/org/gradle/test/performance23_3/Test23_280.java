package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_280 {
    private final Production23_280 production = new Production23_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}