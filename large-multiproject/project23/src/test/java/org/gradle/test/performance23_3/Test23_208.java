package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_208 {
    private final Production23_208 production = new Production23_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}