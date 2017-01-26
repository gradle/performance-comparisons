package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_192 {
    private final Production23_192 production = new Production23_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}