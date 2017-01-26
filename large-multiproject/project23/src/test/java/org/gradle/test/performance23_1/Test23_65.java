package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_65 {
    private final Production23_65 production = new Production23_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}