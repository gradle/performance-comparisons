package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_303 {
    private final Production23_303 production = new Production23_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}