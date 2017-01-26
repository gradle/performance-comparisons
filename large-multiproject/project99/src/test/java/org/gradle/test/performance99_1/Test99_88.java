package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_88 {
    private final Production99_88 production = new Production99_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}