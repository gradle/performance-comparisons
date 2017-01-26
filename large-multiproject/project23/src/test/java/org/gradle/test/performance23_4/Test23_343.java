package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_343 {
    private final Production23_343 production = new Production23_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}