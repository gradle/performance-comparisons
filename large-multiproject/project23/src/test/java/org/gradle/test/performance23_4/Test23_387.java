package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_387 {
    private final Production23_387 production = new Production23_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}