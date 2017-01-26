package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_260 {
    private final Production57_260 production = new Production57_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}