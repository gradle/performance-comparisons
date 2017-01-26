package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_202 {
    private final Production57_202 production = new Production57_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}