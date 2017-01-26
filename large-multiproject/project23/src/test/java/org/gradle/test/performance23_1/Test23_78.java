package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_78 {
    private final Production23_78 production = new Production23_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}