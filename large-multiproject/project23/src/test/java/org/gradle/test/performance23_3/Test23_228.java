package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_228 {
    private final Production23_228 production = new Production23_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}