package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_231 {
    private final Production57_231 production = new Production57_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}