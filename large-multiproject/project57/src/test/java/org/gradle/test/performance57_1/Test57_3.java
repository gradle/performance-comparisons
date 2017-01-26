package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_3 {
    private final Production57_3 production = new Production57_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}