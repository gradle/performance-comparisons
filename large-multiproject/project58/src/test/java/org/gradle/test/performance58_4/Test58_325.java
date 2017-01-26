package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_325 {
    private final Production58_325 production = new Production58_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}