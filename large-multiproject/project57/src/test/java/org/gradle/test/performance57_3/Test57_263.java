package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_263 {
    private final Production57_263 production = new Production57_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}