package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_239 {
    private final Production57_239 production = new Production57_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}