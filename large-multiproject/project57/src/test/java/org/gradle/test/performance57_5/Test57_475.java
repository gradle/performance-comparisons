package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_475 {
    private final Production57_475 production = new Production57_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}