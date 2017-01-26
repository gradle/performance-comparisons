package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_180 {
    private final Production23_180 production = new Production23_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}