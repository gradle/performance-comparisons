package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_464 {
    private final Production91_464 production = new Production91_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}