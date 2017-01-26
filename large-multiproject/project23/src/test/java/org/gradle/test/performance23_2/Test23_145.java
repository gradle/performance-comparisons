package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_145 {
    private final Production23_145 production = new Production23_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}