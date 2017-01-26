package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_419 {
    private final Production23_419 production = new Production23_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}