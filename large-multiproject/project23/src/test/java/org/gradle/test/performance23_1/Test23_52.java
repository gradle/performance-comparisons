package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_52 {
    private final Production23_52 production = new Production23_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}