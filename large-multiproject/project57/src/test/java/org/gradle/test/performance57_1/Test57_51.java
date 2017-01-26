package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_51 {
    private final Production57_51 production = new Production57_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}