package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_21 {
    private final Production23_21 production = new Production23_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}