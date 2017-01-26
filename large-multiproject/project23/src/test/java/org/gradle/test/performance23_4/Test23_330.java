package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_330 {
    private final Production23_330 production = new Production23_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}