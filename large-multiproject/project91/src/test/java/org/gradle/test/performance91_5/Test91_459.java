package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_459 {
    private final Production91_459 production = new Production91_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}