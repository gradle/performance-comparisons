package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_18 {
    private final Production23_18 production = new Production23_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}