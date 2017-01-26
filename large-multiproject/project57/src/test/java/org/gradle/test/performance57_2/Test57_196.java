package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_196 {
    private final Production57_196 production = new Production57_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}