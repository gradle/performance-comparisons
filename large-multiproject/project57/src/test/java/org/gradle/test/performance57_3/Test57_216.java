package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_216 {
    private final Production57_216 production = new Production57_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}