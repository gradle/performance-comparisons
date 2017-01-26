package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_122 {
    private final Production23_122 production = new Production23_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}