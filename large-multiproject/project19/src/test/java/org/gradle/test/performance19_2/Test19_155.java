package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_155 {
    private final Production19_155 production = new Production19_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}