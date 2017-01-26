package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_238 {
    private final Production23_238 production = new Production23_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}