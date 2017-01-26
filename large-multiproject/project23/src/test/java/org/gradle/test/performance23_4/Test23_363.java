package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_363 {
    private final Production23_363 production = new Production23_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}