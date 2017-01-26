package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_29 {
    private final Production57_29 production = new Production57_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}