package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_111 {
    private final Production57_111 production = new Production57_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}