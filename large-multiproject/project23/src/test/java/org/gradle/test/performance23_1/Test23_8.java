package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_8 {
    private final Production23_8 production = new Production23_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}