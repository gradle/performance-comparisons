package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_39 {
    private final Production2_39 production = new Production2_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}