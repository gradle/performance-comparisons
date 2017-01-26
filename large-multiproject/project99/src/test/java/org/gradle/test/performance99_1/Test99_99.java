package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_99 {
    private final Production99_99 production = new Production99_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}