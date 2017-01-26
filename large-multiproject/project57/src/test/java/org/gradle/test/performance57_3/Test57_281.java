package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_281 {
    private final Production57_281 production = new Production57_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}