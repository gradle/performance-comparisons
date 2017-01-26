package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_86 {
    private final Production23_86 production = new Production23_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}