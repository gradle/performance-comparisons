package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_203 {
    private final Production57_203 production = new Production57_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}