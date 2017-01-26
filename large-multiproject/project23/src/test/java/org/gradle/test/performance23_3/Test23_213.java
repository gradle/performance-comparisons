package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_213 {
    private final Production23_213 production = new Production23_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}