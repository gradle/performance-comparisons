package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_30 {
    private final Production23_30 production = new Production23_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}