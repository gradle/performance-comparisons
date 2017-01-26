package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_70 {
    private final Production23_70 production = new Production23_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}