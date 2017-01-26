package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_444 {
    private final Production57_444 production = new Production57_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}