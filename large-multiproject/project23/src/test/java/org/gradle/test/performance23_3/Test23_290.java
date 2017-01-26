package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_290 {
    private final Production23_290 production = new Production23_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}