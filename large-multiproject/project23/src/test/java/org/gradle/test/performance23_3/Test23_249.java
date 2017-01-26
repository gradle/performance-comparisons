package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_249 {
    private final Production23_249 production = new Production23_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}