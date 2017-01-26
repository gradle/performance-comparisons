package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_500 {
    private final Production57_500 production = new Production57_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}