package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_386 {
    private final Production57_386 production = new Production57_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}