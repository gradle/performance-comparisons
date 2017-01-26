package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_108 {
    private final Production23_108 production = new Production23_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}