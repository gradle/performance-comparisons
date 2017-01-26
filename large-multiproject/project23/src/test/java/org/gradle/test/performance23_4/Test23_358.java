package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_358 {
    private final Production23_358 production = new Production23_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}