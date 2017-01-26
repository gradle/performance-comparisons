package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_16 {
    private final Production23_16 production = new Production23_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}