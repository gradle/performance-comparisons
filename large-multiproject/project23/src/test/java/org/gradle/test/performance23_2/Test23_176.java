package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_176 {
    private final Production23_176 production = new Production23_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}