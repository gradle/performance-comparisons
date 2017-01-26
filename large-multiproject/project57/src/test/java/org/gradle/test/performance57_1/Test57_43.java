package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_43 {
    private final Production57_43 production = new Production57_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}