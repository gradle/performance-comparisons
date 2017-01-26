package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_19 {
    private final Production23_19 production = new Production23_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}