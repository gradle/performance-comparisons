package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_325 {
    private final Production37_325 production = new Production37_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}