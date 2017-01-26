package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_138 {
    private final Production57_138 production = new Production57_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}