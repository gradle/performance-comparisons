package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_104 {
    private final Production57_104 production = new Production57_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}