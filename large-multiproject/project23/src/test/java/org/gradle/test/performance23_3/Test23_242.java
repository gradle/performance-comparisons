package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_242 {
    private final Production23_242 production = new Production23_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}