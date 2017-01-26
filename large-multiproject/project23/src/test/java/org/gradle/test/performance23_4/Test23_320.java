package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_320 {
    private final Production23_320 production = new Production23_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}