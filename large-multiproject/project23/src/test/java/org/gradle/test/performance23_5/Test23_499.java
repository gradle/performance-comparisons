package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_499 {
    private final Production23_499 production = new Production23_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}