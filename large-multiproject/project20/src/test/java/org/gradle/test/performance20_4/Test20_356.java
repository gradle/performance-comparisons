package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_356 {
    private final Production20_356 production = new Production20_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}