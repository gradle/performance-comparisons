package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_362 {
    private final Production57_362 production = new Production57_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}