package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_486 {
    private final Production91_486 production = new Production91_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}