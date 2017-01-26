package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_95 {
    private final Production23_95 production = new Production23_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}