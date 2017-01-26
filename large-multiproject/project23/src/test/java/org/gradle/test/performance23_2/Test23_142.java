package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_142 {
    private final Production23_142 production = new Production23_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}