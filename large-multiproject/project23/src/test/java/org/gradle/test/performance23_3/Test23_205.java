package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_205 {
    private final Production23_205 production = new Production23_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}