package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_480 {
    private final Production91_480 production = new Production91_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}