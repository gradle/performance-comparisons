package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_29 {
    private final Production23_29 production = new Production23_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}