package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_321 {
    private final Production23_321 production = new Production23_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}