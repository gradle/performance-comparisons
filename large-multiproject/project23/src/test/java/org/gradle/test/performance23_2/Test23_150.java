package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_150 {
    private final Production23_150 production = new Production23_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}