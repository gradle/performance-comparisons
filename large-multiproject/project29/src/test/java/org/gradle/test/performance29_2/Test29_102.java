package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_102 {
    private final Production29_102 production = new Production29_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}