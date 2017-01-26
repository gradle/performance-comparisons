package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_81 {
    private final Production23_81 production = new Production23_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}