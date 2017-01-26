package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_83 {
    private final Production23_83 production = new Production23_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}