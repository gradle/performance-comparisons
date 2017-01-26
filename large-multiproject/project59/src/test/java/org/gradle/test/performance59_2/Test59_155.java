package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_155 {
    private final Production59_155 production = new Production59_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}