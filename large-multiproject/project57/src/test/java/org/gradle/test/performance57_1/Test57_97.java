package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_97 {
    private final Production57_97 production = new Production57_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}