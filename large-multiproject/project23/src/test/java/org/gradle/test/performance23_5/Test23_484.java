package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_484 {
    private final Production23_484 production = new Production23_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}