package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_137 {
    private final Production23_137 production = new Production23_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}