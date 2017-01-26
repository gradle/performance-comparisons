package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_462 {
    private final Production23_462 production = new Production23_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}