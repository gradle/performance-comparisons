package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_155 {
    private final Production91_155 production = new Production91_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}