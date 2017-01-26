package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_384 {
    private final Production23_384 production = new Production23_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}