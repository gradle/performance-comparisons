package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_337 {
    private final Production23_337 production = new Production23_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}