package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_148 {
    private final Production19_148 production = new Production19_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}