package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_390 {
    private final Production23_390 production = new Production23_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}