package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_155 {
    private final Production65_155 production = new Production65_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}