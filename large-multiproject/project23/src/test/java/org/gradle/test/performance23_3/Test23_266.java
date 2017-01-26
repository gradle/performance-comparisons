package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_266 {
    private final Production23_266 production = new Production23_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}