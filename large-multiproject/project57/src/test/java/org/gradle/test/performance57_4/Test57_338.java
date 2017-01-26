package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_338 {
    private final Production57_338 production = new Production57_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}