package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_193 {
    private final Production91_193 production = new Production91_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}