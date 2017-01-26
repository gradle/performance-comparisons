package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_126 {
    private final Production99_126 production = new Production99_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}