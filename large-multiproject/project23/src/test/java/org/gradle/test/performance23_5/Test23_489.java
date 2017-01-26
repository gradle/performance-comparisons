package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_489 {
    private final Production23_489 production = new Production23_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}