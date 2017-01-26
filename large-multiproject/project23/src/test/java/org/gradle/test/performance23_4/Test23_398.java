package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_398 {
    private final Production23_398 production = new Production23_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}