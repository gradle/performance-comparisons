package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_377 {
    private final Production23_377 production = new Production23_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}