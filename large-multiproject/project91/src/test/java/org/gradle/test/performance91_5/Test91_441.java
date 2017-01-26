package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_441 {
    private final Production91_441 production = new Production91_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}