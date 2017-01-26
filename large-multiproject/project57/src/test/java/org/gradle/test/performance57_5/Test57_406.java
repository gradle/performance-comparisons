package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_406 {
    private final Production57_406 production = new Production57_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}