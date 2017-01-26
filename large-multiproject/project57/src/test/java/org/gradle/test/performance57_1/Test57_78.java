package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_78 {
    private final Production57_78 production = new Production57_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}