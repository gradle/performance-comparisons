package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_357 {
    private final Production23_357 production = new Production23_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}