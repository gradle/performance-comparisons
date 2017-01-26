package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_135 {
    private final Production23_135 production = new Production23_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}