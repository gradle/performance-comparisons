package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_239 {
    private final Production2_239 production = new Production2_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}