package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_479 {
    private final Production91_479 production = new Production91_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}