package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_59 {
    private final Production23_59 production = new Production23_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}