package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_60 {
    private final Production2_60 production = new Production2_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}