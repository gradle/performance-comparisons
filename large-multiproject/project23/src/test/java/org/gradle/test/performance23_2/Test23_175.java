package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_175 {
    private final Production23_175 production = new Production23_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}