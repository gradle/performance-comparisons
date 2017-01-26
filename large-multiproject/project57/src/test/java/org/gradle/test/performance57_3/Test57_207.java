package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_207 {
    private final Production57_207 production = new Production57_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}