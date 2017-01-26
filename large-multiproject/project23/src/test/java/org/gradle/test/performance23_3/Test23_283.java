package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_283 {
    private final Production23_283 production = new Production23_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}