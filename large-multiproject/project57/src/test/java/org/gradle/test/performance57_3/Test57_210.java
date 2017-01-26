package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_210 {
    private final Production57_210 production = new Production57_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}