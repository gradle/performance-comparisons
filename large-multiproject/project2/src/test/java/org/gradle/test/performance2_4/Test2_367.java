package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_367 {
    private final Production2_367 production = new Production2_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}