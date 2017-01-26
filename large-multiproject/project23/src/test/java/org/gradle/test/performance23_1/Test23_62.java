package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_62 {
    private final Production23_62 production = new Production23_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}