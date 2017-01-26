package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_340 {
    private final Production91_340 production = new Production91_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}