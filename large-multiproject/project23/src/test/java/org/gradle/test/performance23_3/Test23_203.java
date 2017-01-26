package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_203 {
    private final Production23_203 production = new Production23_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}