package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_164 {
    private final Production23_164 production = new Production23_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}