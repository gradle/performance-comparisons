package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_246 {
    private final Production2_246 production = new Production2_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}