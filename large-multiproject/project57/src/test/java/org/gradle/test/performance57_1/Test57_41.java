package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_41 {
    private final Production57_41 production = new Production57_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}