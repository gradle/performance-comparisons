package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_195 {
    private final Production57_195 production = new Production57_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}