package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_224 {
    private final Production23_224 production = new Production23_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}