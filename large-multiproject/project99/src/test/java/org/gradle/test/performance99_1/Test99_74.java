package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_74 {
    private final Production99_74 production = new Production99_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}