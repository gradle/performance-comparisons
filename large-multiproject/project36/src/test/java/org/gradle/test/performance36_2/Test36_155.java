package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_155 {
    private final Production36_155 production = new Production36_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}