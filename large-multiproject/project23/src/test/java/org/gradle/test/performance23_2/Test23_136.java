package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_136 {
    private final Production23_136 production = new Production23_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}