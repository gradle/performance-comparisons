package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_218 {
    private final Production23_218 production = new Production23_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}