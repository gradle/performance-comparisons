package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_114 {
    private final Production23_114 production = new Production23_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}