package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_65 {
    private final Production57_65 production = new Production57_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}