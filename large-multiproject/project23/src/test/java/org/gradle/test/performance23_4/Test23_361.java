package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_361 {
    private final Production23_361 production = new Production23_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}