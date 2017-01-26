package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_230 {
    private final Production43_230 production = new Production43_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}