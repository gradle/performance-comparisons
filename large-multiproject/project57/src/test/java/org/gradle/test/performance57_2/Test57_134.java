package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_134 {
    private final Production57_134 production = new Production57_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}