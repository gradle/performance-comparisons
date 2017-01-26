package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_325 {
    private final Production7_325 production = new Production7_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}