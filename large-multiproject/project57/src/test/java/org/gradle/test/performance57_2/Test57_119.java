package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_119 {
    private final Production57_119 production = new Production57_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}