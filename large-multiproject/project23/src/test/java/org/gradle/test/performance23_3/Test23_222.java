package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_222 {
    private final Production23_222 production = new Production23_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}