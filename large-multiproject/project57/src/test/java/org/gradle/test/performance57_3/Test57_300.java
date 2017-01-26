package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_300 {
    private final Production57_300 production = new Production57_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}