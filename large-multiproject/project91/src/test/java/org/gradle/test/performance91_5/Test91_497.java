package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_497 {
    private final Production91_497 production = new Production91_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}