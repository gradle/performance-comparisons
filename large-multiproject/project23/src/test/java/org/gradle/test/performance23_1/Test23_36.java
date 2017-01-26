package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_36 {
    private final Production23_36 production = new Production23_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}