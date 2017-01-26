package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_87 {
    private final Production23_87 production = new Production23_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}