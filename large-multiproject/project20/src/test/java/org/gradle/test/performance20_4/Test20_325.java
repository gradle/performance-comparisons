package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_325 {
    private final Production20_325 production = new Production20_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}