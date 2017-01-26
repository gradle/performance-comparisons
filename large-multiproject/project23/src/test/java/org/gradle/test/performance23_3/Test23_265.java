package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_265 {
    private final Production23_265 production = new Production23_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}