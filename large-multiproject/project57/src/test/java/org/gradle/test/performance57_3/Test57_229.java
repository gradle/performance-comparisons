package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_229 {
    private final Production57_229 production = new Production57_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}