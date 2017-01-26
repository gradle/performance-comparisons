package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_26 {
    private final Production23_26 production = new Production23_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}