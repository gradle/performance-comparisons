package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_235 {
    private final Production23_235 production = new Production23_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}