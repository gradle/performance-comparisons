package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_155 {
    private final Production38_155 production = new Production38_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}