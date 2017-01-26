package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_482 {
    private final Production91_482 production = new Production91_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}