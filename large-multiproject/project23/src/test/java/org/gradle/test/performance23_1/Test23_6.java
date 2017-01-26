package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_6 {
    private final Production23_6 production = new Production23_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}