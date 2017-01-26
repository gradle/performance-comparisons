package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_1 {
    private final Production23_1 production = new Production23_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}