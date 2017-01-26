package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_423 {
    private final Production23_423 production = new Production23_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}