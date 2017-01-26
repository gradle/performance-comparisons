package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_57 {
    private final Production23_57 production = new Production23_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}