package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_155 {
    private final Production2_155 production = new Production2_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}