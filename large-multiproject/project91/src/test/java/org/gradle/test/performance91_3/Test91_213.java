package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_213 {
    private final Production91_213 production = new Production91_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}