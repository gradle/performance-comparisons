package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_333 {
    private final Production23_333 production = new Production23_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}