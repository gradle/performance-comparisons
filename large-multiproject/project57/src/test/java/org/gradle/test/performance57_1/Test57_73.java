package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_73 {
    private final Production57_73 production = new Production57_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}