package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_172 {
    private final Production57_172 production = new Production57_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}