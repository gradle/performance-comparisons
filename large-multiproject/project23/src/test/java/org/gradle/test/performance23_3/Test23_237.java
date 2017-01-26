package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_237 {
    private final Production23_237 production = new Production23_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}