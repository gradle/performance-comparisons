package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_104 {
    private final Production23_104 production = new Production23_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}