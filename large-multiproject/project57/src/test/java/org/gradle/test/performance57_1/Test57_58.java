package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_58 {
    private final Production57_58 production = new Production57_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}