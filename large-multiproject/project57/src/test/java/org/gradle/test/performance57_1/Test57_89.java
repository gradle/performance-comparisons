package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_89 {
    private final Production57_89 production = new Production57_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}