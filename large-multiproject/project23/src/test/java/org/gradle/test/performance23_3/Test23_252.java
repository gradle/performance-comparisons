package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_252 {
    private final Production23_252 production = new Production23_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}