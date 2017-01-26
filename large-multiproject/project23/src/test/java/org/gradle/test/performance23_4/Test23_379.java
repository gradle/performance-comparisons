package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_379 {
    private final Production23_379 production = new Production23_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}