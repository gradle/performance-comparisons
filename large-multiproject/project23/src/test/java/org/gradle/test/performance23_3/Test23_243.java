package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_243 {
    private final Production23_243 production = new Production23_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}