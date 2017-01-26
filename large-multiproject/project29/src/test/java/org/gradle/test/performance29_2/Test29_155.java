package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_155 {
    private final Production29_155 production = new Production29_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}