package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_232 {
    private final Production23_232 production = new Production23_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}