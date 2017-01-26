package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_193 {
    private final Production23_193 production = new Production23_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}