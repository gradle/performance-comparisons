package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_274 {
    private final Production23_274 production = new Production23_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}