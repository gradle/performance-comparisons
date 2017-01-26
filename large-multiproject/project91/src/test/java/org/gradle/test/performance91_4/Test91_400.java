package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_400 {
    private final Production91_400 production = new Production91_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}