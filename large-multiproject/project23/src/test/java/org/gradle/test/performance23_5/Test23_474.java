package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_474 {
    private final Production23_474 production = new Production23_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}