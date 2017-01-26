package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_289 {
    private final Production23_289 production = new Production23_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}