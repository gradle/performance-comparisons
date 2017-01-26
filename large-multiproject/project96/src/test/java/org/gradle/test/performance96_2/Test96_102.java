package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_102 {
    private final Production96_102 production = new Production96_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}