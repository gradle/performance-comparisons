package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_48 {
    private final Production23_48 production = new Production23_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}