package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_254 {
    private final Production23_254 production = new Production23_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}