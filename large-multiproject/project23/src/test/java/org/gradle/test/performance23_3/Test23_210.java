package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_210 {
    private final Production23_210 production = new Production23_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}