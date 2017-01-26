package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_165 {
    private final Production23_165 production = new Production23_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}