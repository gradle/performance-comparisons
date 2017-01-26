package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_392 {
    private final Production2_392 production = new Production2_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}