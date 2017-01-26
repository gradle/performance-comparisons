package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_115 {
    private final Production23_115 production = new Production23_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}