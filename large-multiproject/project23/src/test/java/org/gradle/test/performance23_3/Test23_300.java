package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_300 {
    private final Production23_300 production = new Production23_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}