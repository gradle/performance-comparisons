package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_337 {
    private final Production57_337 production = new Production57_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}