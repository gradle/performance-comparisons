package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_492 {
    private final Production23_492 production = new Production23_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}