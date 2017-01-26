package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_216 {
    private final Production23_216 production = new Production23_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}