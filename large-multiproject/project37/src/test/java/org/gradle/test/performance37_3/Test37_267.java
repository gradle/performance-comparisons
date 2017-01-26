package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_267 {
    private final Production37_267 production = new Production37_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}