package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_482 {
    private final Production23_482 production = new Production23_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}