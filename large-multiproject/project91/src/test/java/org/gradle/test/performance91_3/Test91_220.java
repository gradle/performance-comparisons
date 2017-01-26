package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_220 {
    private final Production91_220 production = new Production91_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}