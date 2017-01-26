package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_72 {
    private final Production57_72 production = new Production57_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}