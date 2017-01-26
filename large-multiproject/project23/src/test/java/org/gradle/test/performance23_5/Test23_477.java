package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_477 {
    private final Production23_477 production = new Production23_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}