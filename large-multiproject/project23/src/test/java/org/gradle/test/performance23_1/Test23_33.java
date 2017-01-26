package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_33 {
    private final Production23_33 production = new Production23_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}