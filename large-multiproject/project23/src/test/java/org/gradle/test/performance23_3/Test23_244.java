package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_244 {
    private final Production23_244 production = new Production23_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}