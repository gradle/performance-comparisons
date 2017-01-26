package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_46 {
    private final Production23_46 production = new Production23_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}