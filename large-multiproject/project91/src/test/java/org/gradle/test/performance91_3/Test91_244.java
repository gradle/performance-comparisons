package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_244 {
    private final Production91_244 production = new Production91_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}