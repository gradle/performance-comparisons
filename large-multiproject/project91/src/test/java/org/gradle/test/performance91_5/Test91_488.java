package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_488 {
    private final Production91_488 production = new Production91_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}