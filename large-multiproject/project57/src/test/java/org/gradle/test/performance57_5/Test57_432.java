package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_432 {
    private final Production57_432 production = new Production57_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}