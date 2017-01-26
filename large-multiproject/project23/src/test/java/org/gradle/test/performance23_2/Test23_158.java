package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_158 {
    private final Production23_158 production = new Production23_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}