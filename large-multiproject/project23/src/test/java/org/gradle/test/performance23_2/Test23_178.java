package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_178 {
    private final Production23_178 production = new Production23_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}