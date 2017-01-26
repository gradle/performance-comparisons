package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_171 {
    private final Production57_171 production = new Production57_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}