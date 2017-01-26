package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_63 {
    private final Production23_63 production = new Production23_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}