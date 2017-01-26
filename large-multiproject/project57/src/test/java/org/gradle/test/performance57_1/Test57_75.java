package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_75 {
    private final Production57_75 production = new Production57_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}