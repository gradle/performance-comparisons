package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_15 {
    private final Production23_15 production = new Production23_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}