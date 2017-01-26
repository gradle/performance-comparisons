package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_109 {
    private final Production57_109 production = new Production57_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}