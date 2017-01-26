package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_156 {
    private final Production23_156 production = new Production23_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}