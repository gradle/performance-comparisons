package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_395 {
    private final Production23_395 production = new Production23_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}