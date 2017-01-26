package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_479 {
    private final Production23_479 production = new Production23_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}