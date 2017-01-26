package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_143 {
    private final Production23_143 production = new Production23_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}