package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_228 {
    private final Production57_228 production = new Production57_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}