package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_284 {
    private final Production23_284 production = new Production23_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}