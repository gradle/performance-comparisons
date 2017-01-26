package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_269 {
    private final Production57_269 production = new Production57_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}