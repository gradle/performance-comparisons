package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_238 {
    private final Production57_238 production = new Production57_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}