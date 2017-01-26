package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_268 {
    private final Production2_268 production = new Production2_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}