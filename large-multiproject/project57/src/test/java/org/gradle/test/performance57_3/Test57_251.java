package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_251 {
    private final Production57_251 production = new Production57_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}