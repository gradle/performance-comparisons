package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_484 {
    private final Production57_484 production = new Production57_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}