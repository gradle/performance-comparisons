package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_309 {
    private final Production23_309 production = new Production23_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}