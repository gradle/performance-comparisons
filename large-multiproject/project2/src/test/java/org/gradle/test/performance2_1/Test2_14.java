package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_14 {
    private final Production2_14 production = new Production2_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}