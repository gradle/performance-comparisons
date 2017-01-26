package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_74 {
    private final Production57_74 production = new Production57_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}