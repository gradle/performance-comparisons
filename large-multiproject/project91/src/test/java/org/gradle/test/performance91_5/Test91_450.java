package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_450 {
    private final Production91_450 production = new Production91_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}