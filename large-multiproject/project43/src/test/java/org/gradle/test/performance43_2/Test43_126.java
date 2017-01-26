package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_126 {
    private final Production43_126 production = new Production43_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}