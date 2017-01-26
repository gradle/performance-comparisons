package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_148 {
    private final Production64_148 production = new Production64_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}