package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_282 {
    private final Production57_282 production = new Production57_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}