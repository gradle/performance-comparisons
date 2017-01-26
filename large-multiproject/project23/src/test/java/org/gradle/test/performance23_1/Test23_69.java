package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_69 {
    private final Production23_69 production = new Production23_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}