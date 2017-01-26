package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_468 {
    private final Production23_468 production = new Production23_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}