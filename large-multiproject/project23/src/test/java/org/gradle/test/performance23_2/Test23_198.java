package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_198 {
    private final Production23_198 production = new Production23_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}