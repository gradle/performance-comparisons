package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_321 {
    private final Production91_321 production = new Production91_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}