package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_308 {
    private final Production23_308 production = new Production23_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}