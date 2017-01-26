package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_127 {
    private final Production23_127 production = new Production23_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}