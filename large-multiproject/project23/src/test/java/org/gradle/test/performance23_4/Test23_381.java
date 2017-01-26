package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_381 {
    private final Production23_381 production = new Production23_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}