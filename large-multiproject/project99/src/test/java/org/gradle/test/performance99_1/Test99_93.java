package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_93 {
    private final Production99_93 production = new Production99_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}