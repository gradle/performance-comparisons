package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_28 {
    private final Production23_28 production = new Production23_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}